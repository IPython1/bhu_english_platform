package com.dyj.myspringboot.controller;

import com.dyj.myspringboot.pojo.Word;
import com.dyj.myspringboot.service.Impl.WordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CollectionController {
    @Autowired
    WordServiceImpl wordService;

    //去收藏页面
    @RequestMapping("/toCollection")
    public String toCollection(){
        return "user/collection";
    }

    //去单词收藏
    @RequestMapping("/wordCollection")
    public String wordCollection(Model model){

        List<Word> word = wordService.queryAllWordCollection();


        model.addAttribute("word",word);

        return "user/word/collection-word";
    }

    //取消单词收藏
    @RequestMapping("/deleteWordCollection/{wordId}")
    public String deleteWordCollection(@PathVariable("wordId") Integer wordId, Model model){

        wordService.updateWordCollection0(wordId);
        return "redirect:/wordCollection";
    }

    //去生词本
    @RequestMapping("/wordRaw")
    public String wordRaw(Model model){
        List<Word> word = wordService.queryAllUnremembered();



        model.addAttribute("word",word);

        return "user/word/raw-word";
    }

    //取消生词
    @RequestMapping("/deleteWordRaw/{wordId}")
    public String deleteWordRaw(@PathVariable("wordId") Integer wordId, Model model){
        wordService.updateWordRemember1(wordId);


        return "redirect:/wordRaw";
    }

}
