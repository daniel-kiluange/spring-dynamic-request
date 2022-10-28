package com.example.springmutablerequest.engine;

import java.util.Collection;
import lombok.Data;

@Data
public class OrderMessageBody {
  private Collection<Integer> ids;
  private String p1;
}
