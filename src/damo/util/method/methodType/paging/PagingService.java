package damo.util.method.methodType.paging;

import java.util.ArrayList;
import java.util.List;

public class PagingService<Inerger> {
	private PagingBean pagingBean;

	public PagingService(PagingBean pagingBean) {
		this.pagingBean = pagingBean;
	}

	public PagingService() {
	}

	/*
	 * 当前页码数
	 * 
	 * @showpages 输入时当前要分页的数目 每页显示多少钱
	 * 
	 * @return
	 * 
	 * tem[0]=pages; 最后一页是多少条 tem[1]=pageNum; 总共多少页
	 */
	public int nowingPage(Integer lastPage, Integer showpages) {
		int nowpages = (lastPage / showpages) + 1;// 不够除防止出现0
		if (nowpages == 0) {
			nowpages++;
		}
		// }
		return nowpages;
	}

	/*
	 * 上一页的页码数
	 * 
	 * @showpages 输入时当前要分页的数目 每页显示多少钱
	 * 
	 * @return
	 * 
	 * tem[0]=pages; 最后一页是多少条 tem[1]=pageNum; 总共多少页
	 */
	public int upPages(Integer firstPage, Integer showpages) {
		int pages = firstPage - showpages;
		if (pages <= 0) {
			pages = 0;
		}

		// }
		return pages;
	}

	/*
	 * 上一页的页码数
	 * 
	 * @showpages 输入时当前要分页的数目 每页显示多少钱
	 * 
	 * @return
	 * 
	 * tem[0]=pages; 最后一页是多少条 tem[1]=pageNum; 总共多少页
	 */
	public int nextPages(Integer lastPage, Integer showpages) {
		// int[] tem = null;
		// int pageNum = (pagingBean.getCount_page()) % showpages;// 剩余多少条
		// int pages = (pagingBean.getCount_page()) / showpages;//
		int pages = lastPage + showpages;
		if (pages >= pagingBean.getCount_page()) {
			pages = pagingBean.getCount_page();
		}

		// }
		return pages;
	}

	/*
	 * 当前页码
	 * 
	 * @showpages 输入时当前要分页的数目 每页显示多少钱
	 * 
	 * @return
	 * 
	 * tem[0]=pages; 最后一页是多少条 tem[1]=pageNum; 总共多少页
	 */
	@SuppressWarnings("null")
	public int[] nowPage(Integer showpages) {
		int[] tem = null;
		int pageNum = (pagingBean.getCount_page()) % showpages;// 剩余多少条
		int pages = (pagingBean.getCount_page()) / showpages;//
		tem[0] = pages;
		tem[1] = pageNum;
		return tem;
	}

	/*
	 * 第一页
	 * 
	 * @showpages 输入时当前要分页的数目 每页显示多少钱
	 * 
	 * @return 0-每页显示的条数
	 * 
	 */
	@SuppressWarnings("null")
	public int[] firstPage(Integer showpages) {
		int[] tem = null;
		tem[0] = 0;
		tem[1] = showpages - 1;
		return tem;
	}

	/*
	 * 最后一页
	 * 
	 * @showpages 输入时当前要分页的数目 每页显示多少钱
	 * 
	 * @return 倒数showpages 条数据
	 * 
	 */
	@SuppressWarnings("null")
	public int[] lasttPage(Integer showpages) {
		int[] tem = null;
		tem[0] = pagingBean.getCount_page() - showpages;
		tem[1] = pagingBean.getCount_page();
		return tem;
	}

	/*
	 * 当前排版页码
	 * 
	 * @showpages 输入时当前要分页的数目 每页显示多少钱
	 * 
	 * @return 倒数showpages 条数据
	 * 
	 */
	public List<Object> allPage(Integer firstPage, Integer lastPage, Integer showpages) {
		List<Object> list = new ArrayList<Object>();
		int[] tem = new int[2];
		int[] tem1 = new int[2];
		int[] tem2 = new int[2];
		for (int i = 0; i <= showpages / 2; i++) {
			// [firstPage-showpages-showpages*i,firstPage-showpages*i] 左边是数据
			tem[0] = firstPage - showpages - showpages * i;
			tem[1] = firstPage - showpages * i;
			list.add(tem);
		}
		tem1[0] = firstPage;
		tem1[1] = lastPage;
		list.add(tem1);
		for (int i = 0; i <= showpages / 2; i++) {
			// [lastPage+showpages*i,firstPage+showpages+showpages*i] 右边是数据
			tem2[0] = lastPage + showpages * i;
			tem2[1] = firstPage + showpages + showpages * i;
			list.add(tem2);
		}
		return list;
	}

	/*
	 * 上一页
	 * 
	 * @showpages 亲端传过来的当前页码
	 * 
	 * @return 倒数showpages 条数据
	 * 
	 */
	public int[] upPage(Integer firstPage, Integer showpages) {
		int[] tem = new int[2];
		tem[0] = firstPage - showpages;
		tem[1] = firstPage;
		return tem;
	}

	/*
	 * 下一页
	 * 
	 * @showpages 亲端传过来的当前页码
	 * 
	 * @return 倒数showpages 条数据
	 * 
	 */
	public int[] nextPage(Integer lastPage, Integer showPages) {
		int[] tem = new int[2];
		tem[0] = lastPage;
		tem[1] = lastPage + showPages;
		return tem;
	}
}
