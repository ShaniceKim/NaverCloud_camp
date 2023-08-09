package bitcamp.myapp.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import bitcamp.myapp.vo.Reserve;

public class MySQLReserveDao implements ReserveDao {

  SqlSessionFactory sqlSessionFactory;

  public MySQLReserveDao(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public void insert(Reserve reserve) {
    SqlSession sqlSession = sqlSessionFactory.openSession(false);
    sqlSession.insert("bitcamp.myapp.dao.ReserveDao.insert", reserve);
  }

  @Override
  public List<Reserve> findAll() {
    SqlSession sqlSession = sqlSessionFactory.openSession(false);
    return sqlSession.selectList("bitcamp.myapp.dao.ReserveDao.findAll");
  }

  @Override
  public Reserve findBy(int no) {
    SqlSession sqlSession = sqlSessionFactory.openSession(false);
    return sqlSession.selectOne("bitcamp.myapp.dao.ReserveDao.findBy", no);
  }

  @Override
  public int update(Reserve reserve) {
    SqlSession sqlSession = sqlSessionFactory.openSession(false);
    return sqlSession.update("bitcamp.myapp.dao.ReserveDao.update", reserve);
  }

  @Override
  public int delete(int no) {
    SqlSession sqlSession = sqlSessionFactory.openSession(false);
    return sqlSession.delete("bitcamp.myapp.dao.ReserveDao.delete", no);
  }
}
