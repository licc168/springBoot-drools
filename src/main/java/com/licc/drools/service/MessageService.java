package com.licc.drools.service;

import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 *
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/8/16 9:42
 * @see
 */
@Service
public class MessageService {
  public void outMsg(@NonNull String name){
    System.out.println("MessageService:  "+name);
  }
}
