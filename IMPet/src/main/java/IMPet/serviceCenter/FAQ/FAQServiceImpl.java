package IMPet.serviceCenter.FAQ;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service(value="fAQService")
public class FAQServiceImpl implements FAQService{

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "fAQDAO")
	private FAQDAO fAQDAO;

	@Override
	public List<Map<String, Object>> selectAll() throws Exception {

		return fAQDAO.selectAll();
	}

	@Override
	public Map<String, Object> selectOne(Map<String, Object> map) throws Exception {
		return fAQDAO.selectOne(map);
	}

	@Override
	public void insert(Map<String, Object> map) throws Exception {
		fAQDAO.insert(map);
		
	}

	@Override
	public void update(Map<String, Object> map) throws Exception {
		fAQDAO.update(map);
		
	}

	@Override
	public void delete(Map<String, Object> map) throws Exception {
		fAQDAO.delete(map);
		
	}
	
	

}
