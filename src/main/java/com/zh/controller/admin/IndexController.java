package com.zh.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhanghao on 2017/4/11.
 */
@Controller
@EnableAutoConfiguration
public class IndexController {
    @Autowired
    //PeopleRepository peopleRepository;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index() {
        return "admin/index";//意思是：调用admin文件夹下的index.html模板
    }
    //page参数就是第几页的页数
//    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
//    @ResponseBody
//    public String ajaxPage(@RequestParam(value = "page")int page){
//        //Spring data自带的分页类，传入页数page和每页展示10条，作为参数。
//        //返回一个分页类，这个类里包含了总页数、请求页的具体数据。
//        Page<People> peoplePage = peopleRepository.findAll(new PageRequest(page,10));
//
//        //总页数
//        int totalPages = peoplePage.getTotalPages();
//
//        //这一页的数据---一个People类的List
//        List<People> peopleList = peoplePage.getContent();
//
//        //把上面得到的数据，打包转换为一个JSON，返回给Ajax.
//
//        //先构造一个Map，把上面的数据放进去。
//        HashMap<String,Object> jsonMap = new HashMap<>();
//        jsonMap.put("totalpages",totalPages);//总页数
//        jsonMap.put("page",page);//当前页
//        jsonMap.put("data",peopleList);
//
//        //然后把上面的Map转换为JSON
//        ObjectMapper mapper = new ObjectMapper();
//
//        try{
//            String json = mapper.writeValueAsString(jsonMap);
//            return json;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return "wrong";
//    }
}