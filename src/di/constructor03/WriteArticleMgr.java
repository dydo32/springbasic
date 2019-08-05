package di.constructor03;
//service�� ������ �ϴ� Ŭ����
public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	
	public WriteArticleMgr(){	//�⺻������ �����α�
		System.out.println("�⺻������");
	}
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	@Override
	public void write(ArticleDTO article) {
		//System.out.println(article.getName()+", "+article.getTitle()+", "+article.getContent()+", "+article.getDate());
		articleDAO.insert(article);
	}
}
