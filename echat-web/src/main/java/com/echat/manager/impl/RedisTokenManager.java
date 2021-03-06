package com.echat.manager.impl;

import com.echat.manager.TokenManager;
import com.echat.model.TokenModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 通过Redis存储和验证token的实现类
 *
 * @author ScienJus
 * @date 2015/7/31.
 * @see TokenManager
 */
@Component
public class RedisTokenManager implements TokenManager {


  /**
   * 创建一个token关联上指定用户
   *
   * @param userId 指定用户的id
   * @return 生成的token
   */
  public TokenModel createToken(long userId) {
    return null;
  }

  /**
   * 检查token是否有效
   *
   * @param model token
   * @return 是否有效
   */
  public boolean checkToken(TokenModel model) {
    return false;
  }

  /**
   * 从字符串中解析token
   *
   * @param authentication 加密后的字符串
   * @return
   */
  public TokenModel getToken(String authentication) {
    return null;
  }

  /**
   * 清除token
   *
   * @param userId 登录用户的id
   */
  public void deleteToken(long userId) {

  }
}
