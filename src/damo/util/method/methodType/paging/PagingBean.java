package damo.util.method.methodType.paging;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class PagingBean implements Serializable {
	private Integer defaul_page;// 默认分页 每页多少条记录
	private Integer first_page;// 当前分页的第一条记录下标
	private Integer last_page;// 当前分页的最后一条记录下标
	private Integer now_page;// 当前页码
	private Integer count_page;// 总共多少条
	private List<Object> all_page;// 分页数据集

	public PagingBean() {
	}

	public Integer getDefaul_page() {
		return defaul_page;
	}

	public void setDefaul_page(Integer defaul_page) {
		this.defaul_page = defaul_page;
	}

	public Integer getFirst_page() {
		return first_page;
	}

	public void setFirst_page(Integer first_page) {
		this.first_page = first_page;
	}

	public Integer getLast_page() {
		return last_page;
	}

	public void setLast_page(Integer last_page) {
		this.last_page = last_page;
	}

	public Integer getNow_page() {
		return now_page;
	}

	public void setNow_page(Integer now_page) {
		this.now_page = now_page;
	}

	public Integer getCount_page() {
		return count_page;
	}

	public void setCount_page(Integer count_page) {
		this.count_page = count_page;
	}

	public List<Object> getAll_page() {
		return all_page;
	}

	public void setAll_page(List<Object> all_page) {
		this.all_page = all_page;
	}

	public PagingBean(Integer defaul_page, Integer first_page, Integer last_page, Integer now_page, Integer count_page,
			List<Object> all_page) {
		super();
		this.defaul_page = defaul_page;
		this.first_page = first_page;
		this.last_page = last_page;
		this.now_page = now_page;
		this.count_page = count_page;
		this.all_page = all_page;
	}

	@Override
	public String toString() {
		return "PagingBean [defaul_page=" + defaul_page + ", first_page=" + first_page + ", last_page=" + last_page
				+ ", now_page=" + now_page + ", count_page=" + count_page + ", all_page=" + all_page + "]";
	}

	
}
