package com.example.springmutablerequest.engine;

import java.util.Collection;
import lombok.Data;

@Data
public class UpdateMessageBody {
  private Collection<Integer> ids;
  private String p2;
  private String p3;
}
