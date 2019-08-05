package di.setter03;
//service의 역할을 하는 클래스
public class WriteArticleMgr implements IWriteArticleMgr {
	IArticleDAO articleDAO;
	
	public WriteArticleMgr(){	//기본생성자 만들어두기
		System.out.println("WriteArticleMgr의 기본생성자");
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
		System.out.println("WriteArticleMgr의 setter메소드");
	}
	@Override
	public void write(ArticleDTO article) {
		//System.out.println(article.getName()+", "+article.getTitle()+", "+article.getContent()+", "+article.getDate());
		articleDAO.insert(article);
	}
}
