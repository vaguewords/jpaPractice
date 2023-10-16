package com.springdatajpa.practice.drink.service;

import com.springdatajpa.practice.drink.dto.DrinkDTO;
import com.springdatajpa.practice.drink.dto.TypeDTO;
import com.springdatajpa.practice.drink.entity.Drink;
import com.springdatajpa.practice.drink.entity.Type;
import com.springdatajpa.practice.drink.repository.DrinkRepository;
import com.springdatajpa.practice.drink.repository.TypeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DrinkService {

    private final DrinkRepository drinkRepository;

    private final ModelMapper modelMapper;

    private final TypeRepository typeRepository;

    public DrinkService(DrinkRepository drinkRepository, ModelMapper modelMapper, TypeRepository typeRepository) {
        this.drinkRepository = drinkRepository;
        this.modelMapper = modelMapper;
        this.typeRepository = typeRepository;
    }

    public DrinkDTO findDrinkByCode(Integer drinkCode) {
        Drink drink = drinkRepository.findById(drinkCode).orElseThrow(IllegalArgumentException::new);
        // modelMapper는 entity를 DTO로 변환하여 반환해 줌
        return modelMapper.map(drink, DrinkDTO.class);
    }

    public Page<DrinkDTO> findAllDrink(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, pageable.getPageSize(), Sort.by("drinkCode"));
        /*
         * findAll() 메소드는 이미 구현되어 있어 별도 정의할 필요 없음
         * Sort 기준을 전달할 수 있음
         * */
        Page<Drink> drinkList = drinkRepository.findAll(pageable);
        // 디센딩 걸면 내림차순
        return drinkList.map(drink -> modelMapper.map(drink, DrinkDTO.class));
    }

    public List<DrinkDTO> findByDrinkPrice(Integer drinkPrice) {
        List<Drink> drinkList = drinkRepository.findByDrinkPriceGreaterThan(drinkPrice, Sort.by("drinkPrice"));
        // 디센딩 걸면 내림차순
        return drinkList.stream().map(drink -> modelMapper.map(drink, DrinkDTO.class))
                .collect(Collectors.toList());
    }

    public List<TypeDTO> findAllType() {
        List<Type> typeList = typeRepository.findAllType();
        return typeList.stream().map(type -> modelMapper.map(type, TypeDTO.class)).collect(Collectors.toList());
    }

    @Transactional
    public void registNewDrink(DrinkDTO newDrink) {
        System.out.println(drinkRepository.save(modelMapper.map(newDrink, Drink.class)));
        drinkRepository.save(modelMapper.map(newDrink, Drink.class));

    }

    @Transactional
    public void modifyDrink(DrinkDTO modifyDrink) {
        Drink foundDrink = drinkRepository.findById(modifyDrink.getDrinkCode()).orElseThrow(IllegalArgumentException::new);
        foundDrink.setDrinkName(modifyDrink.getDrinkName());
    }

    @Transactional
    public void deleteDrink(Integer drinkCode) {
        drinkRepository.deleteById(drinkCode);
    }


}
