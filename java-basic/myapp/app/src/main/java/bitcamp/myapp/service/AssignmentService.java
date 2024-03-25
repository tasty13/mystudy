package bitcamp.myapp.service;

import bitcamp.myapp.vo.Assignment;
import bitcamp.myapp.vo.Member;
import java.util.List;

public interface AssignmentService {

  void add(Assignment assignment);

  List<Assignment> list();

  Assignment get(int no);

  int update(Assignment assignment);

  int delete(int no);
}
