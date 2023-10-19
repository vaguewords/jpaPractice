package com.springdatajpa.practice.drink.controller;

import com.springdatajpa.practice.common.Pagination;
import com.springdatajpa.practice.common.PagingButton;
import com.springdatajpa.practice.drink.dto.DrinkDTO;
import com.springdatajpa.practice.drink.dto.TypeDTO;
import com.springdatajpa.practice.drink.service.DrinkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/drink")
public class DrinkController {

    private final DrinkService drinkService;

    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping("/{drinkCode}")
    public String findDrinkByCode(@PathVariable int drinkCode, Model model) {
        DrinkDTO drink = drinkService.findDrinkByCode(drinkCode);

        model.addAttribute("drink", drink);

        return "drink/findone";
    }

    @GetMapping("/findall")
    public String findAllDrink(Model model, @PageableDefault Pageable pageable) {

        log.info("pageable : {}", pageable);

        Page<DrinkDTO> drinkList = drinkService.findAllDrink(pageable);

        log.info("조회한 내용 목록 : {}", drinkList.getContent());
        log.info("총 페이지 수 : {}", drinkList.getTotalPages());
        log.info("총 메뉴 수 : {}", drinkList.getTotalElements());
        log.info("현재 페이지에 표시될 요소 수 : {}", drinkList.getSize());
        log.info("현재 페이지의 실제 요소 수 : {}", drinkList.getNumberOfElements());
        log.info("첫 페이지인가? : {}", drinkList.isFirst());
        log.info("마지막 페이지인가? : {}", drinkList.isLast());
        log.info("정렬 방식 : {}", drinkList.getSort());
        log.info("현재 인덱스 : {}", drinkList.getNumber());

        PagingButton paging = Pagination.getPagingButtonInfo(drinkList);

        model.addAttribute("drinkList", drinkList);
        model.addAttribute("paging", paging);

        return "drink/findall";
    }

    @GetMapping("/querymethod")
    public void queryMethodPage() {}

    @GetMapping("/search")
    public String findByDrinkPrice(@RequestParam Integer drinkPrice, Model model) {
        List<DrinkDTO> drinkList = drinkService.findByDrinkPrice(drinkPrice);

        model.addAttribute("drinkList", drinkList);
        model.addAttribute("drinkPrice", drinkList);

        return "drink/searchresult";
    }

    @GetMapping("/insert")
    public void registPage() {}

    @GetMapping(value = "/type", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<TypeDTO> findTypeList() {
        return drinkService.findAllType();
    }

    @PostMapping("/insert")
    public String registNewDrink(DrinkDTO drinkDTO) {
        drinkService.registNewDrink(drinkDTO);
        return "redirect:/drink/findall";
    }

    @GetMapping("/update")
    public void modifyPage() {}

    @PostMapping("/update")
    public String modifyDrink(DrinkDTO modifyDrink) {
        drinkService.modifyDrink(modifyDrink);
        return "redirect:/drink/" + modifyDrink.getDrinkCode();
    }

    @GetMapping("/delete")
    public void deletePage() {}

    @PostMapping("/delete")
    public String deleteDrink(@RequestParam Integer drinkCode) {
        drinkService.deleteDrink(drinkCode);

        return "redirect:/drink/findall";
    }


}