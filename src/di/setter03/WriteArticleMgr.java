package di.setter03;
//service�� ������ �ϴ� Ŭ����
public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	
	public WriteArticleMgr(){	//�⺻������ �����α�
		System.out.println("WriteArticleMgr�� �⺻������");
	}
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	
	public IArticleDAO getArticleDAO() {
		return articleDAO;
	}
	public void setArticleDAO(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
		System.out.println("WriteArticleMgr�� setter�޼ҵ�");
	}
	@Override
	public void write(ArticleDTO article) {
		//System.out.println(article.getName()+", "+article.getTitle()+", "+article.getContent()+", "+article.getDate());
		articleDAO.insert(article);
	}
}
