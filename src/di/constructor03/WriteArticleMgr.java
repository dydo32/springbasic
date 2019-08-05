package di.constructor03;
//service의 역할을 하는 클래스
public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	
	public WriteArticleMgr(){	//기본생성자 만들어두기
		System.out.println("기본생성자");
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
