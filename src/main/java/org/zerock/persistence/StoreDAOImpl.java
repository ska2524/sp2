package org.zerock.persistence;


import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;
@Service
public class StoreDAOImpl implements StoreDAO {
	
	static final String namespace
	="org.zerock.persistence.StoreDAO";
	
	
	@Inject
	SqlSession session;
	
	@Override
	public void create(StoreVO vo) {
		session.insert(namespace+".create", vo);

	}

	@Override
	public StoreVO read(Integer sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(StoreVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer sno) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTime() throws Exception {
		return session.selectOne(namespace+".getTime");
		
	}

	@Override
	public List<StoreVO> list(Criteria cri) throws Exception {
		
//		return session.selectList(namespace+".list", cri);
		return session.selectList(namespace+".listTypes", cri);
		
	}

	@Override
	public int listCount(Criteria cri) throws Exception {
		
		return session.selectOne(namespace+".listCount", cri);
	}

}
