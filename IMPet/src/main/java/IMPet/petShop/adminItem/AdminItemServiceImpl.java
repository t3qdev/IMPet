package IMPet.petShop.adminItem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service("adminItemService")
public class AdminItemServiceImpl implements AdminItemService{
	
	@Resource(name = "adminItemDAO")
	private AdminItemDAO adminItemDAO;

	//뭔지모르겠
//	@Resource(name = "goodsImageUtils")
//	private GoodsImageUtils goodsImageUtils;
 
	// 상품 목록 전체 불러오기
	@Override
	public List<Map<String, Object>> itemList(Map<String, Object> map) throws Exception {

		List<Map<String, Object>> list = adminItemDAO.itemList(map);
		return list;
	}
	
	@Override
	public void itemInsert(Map<String, Object> map) throws Exception {
		
		adminItemDAO.itemInsert(map);
		
	}

	@Override
	public Map<String, Object> itemSelect(Map<String, Object> map) throws Exception {
		
		return adminItemDAO.itemSelect(map);
	}

	@Override
	public List<Map<String, Object>> itemSearch1(String isSearch) throws Exception {
		// TODO Auto-generated method stub
		return adminItemDAO.itemSearch1(isSearch);
	}

	@Override
	public List<Map<String, Object>> itemSearch2(String isSearch) throws Exception {
		// TODO Auto-generated method stub
		return adminItemDAO.itemSearch2(isSearch);
	}

	@Override
	public List<Map<String, Object>> itemSearch3(String isSearch) throws Exception {
		// TODO Auto-generated method stub
		return adminItemDAO.itemSearch3(isSearch);
	}

	@Override
	public List<Map<String, Object>> itemSearch4(String isSearch) throws Exception {
		// TODO Auto-generated method stub
		return adminItemDAO.itemSearch4(isSearch);
	}

	@Override
	public List<Map<String, Object>> itemSearch5(String isSearch) throws Exception {
		// TODO Auto-generated method stub
		return adminItemDAO.itemSearch5(isSearch);
	}

	@Override
	public List<Map<String, Object>> itemSearch6(String isSearch) throws Exception {
		// TODO Auto-generated method stub
		return adminItemDAO.itemSearch6(isSearch);
	}

	@Override
	public List<Map<String, Object>> itemSearch7(String isSearch) throws Exception {
		// TODO Auto-generated method stub
		return adminItemDAO.itemSearch7(isSearch);
	}

	
	
	
	
	
	
	
	


}
