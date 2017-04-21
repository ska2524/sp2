package org.zerock.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;
@Repository
public interface StoreDAO {
	
	
	public void create(StoreVO vo)throws Exception;
	
	public StoreVO read(Integer sno)throws Exception;
	
	public void update(StoreVO vo)throws Exception;
	
	public void delete(Integer sno)throws Exception;
	
	public String getTime()throws Exception;
	
	public List<StoreVO> list(Criteria cri) throws Exception;
	
	public int listCount(Criteria cri)throws Exception;
	
	
	
	
	
}
