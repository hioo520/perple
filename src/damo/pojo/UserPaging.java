package damo.pojo;

import java.io.Serializable;
import java.util.List;

import damo.util.method.methodType.paging.PagingBean;

public class UserPaging implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<User> listUser;
	PagingBean pagingBean;

	public UserPaging() {
	}

	public UserPaging(List<User> listUser, PagingBean pagingBean) {
		this.listUser = listUser;
		this.pagingBean = pagingBean;
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public PagingBean getPagingBean() {
		return pagingBean;
	}

	public void setPagingBean(PagingBean pagingBean) {
		this.pagingBean = pagingBean;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
