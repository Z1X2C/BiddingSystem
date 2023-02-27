package com.zhangbo.controller;

import com.zhangbo.pojo.User;
import com.zhangbo.service.UserService;
import com.zhangbo.until.PageQuery;
import com.zhangbo.until.Params;
import com.zhangbo.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "login")
    public Result login(@RequestBody User user) {
        return userService.login(user);
    }

    @RequestMapping("logout")
    public Result logout() {
        return userService.logout();
    }

//    @PreAuthorize("hasAuthority('admin')")
    @GetMapping("userinfo")
//    public Result get_userinfo(@RequestParam(value = "token", required = true) String token) {
    public Result get_userinfo() {
        return userService.userinfo();
    }
  @PostMapping("findAll")
  public Result findAll(@RequestBody PageQuery pageQuery){
        return userService.findAll(pageQuery);
  }
    @PostMapping("register")
    public Result register(@RequestBody User user) {
        return userService.register(user);
    }
    @PutMapping("ban_user")
    public Result banuser(@RequestBody User user){
        return  userService.banuser(user);
    }
    @PostMapping("user_avatar")
    public Result user_avatar(@RequestParam MultipartFile avatar){
        return userService.user_avatar(avatar);
    }
    @GetMapping("check_code")
    public Result checkcode(){
        return userService.checkbox();
    }
    @PutMapping("update_pass")
    public Result updatepass(@RequestBody Params params){
        return userService.updatepass(params);
    }
    @PutMapping("user_update")
    public Result user_update(@RequestBody Params params){
        return userService.user_update(params);
    }
}

