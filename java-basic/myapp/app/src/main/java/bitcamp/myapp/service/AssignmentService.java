package bitcamp.myapp.service;

import bitcamp.myapp.vo.Assignment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssignmentService {

  void add(Assignment assignment);

  List<Assignment> list(
      @Param("offset") int offset,
      @Param("rowCount") int rowCount);

  Assignment get(int no);

  int update(Assignment assignment);

  int delete(int no);

  int countAll();
}
