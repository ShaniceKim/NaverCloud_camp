package bitcamp.myapp.dao;

import java.util.List;
import bitcamp.myapp.vo.Reserve;

public interface ReserveDao {
  void insert(Reserve reserve);
  List<Reserve> findAll();
  Reserve findBy(int no);
  int update(Reserve reserve);
  int delete(int no);
}
