package com.example.springmutablerequest.engine;

import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class UpdateMessageBody {
  private Collection<Integer> ids;
  private String p2;
  private String p3;
}
