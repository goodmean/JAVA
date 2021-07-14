import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		exam4();
	}
	
	static void exam4() {
		List<Article> articles = new ArrayList<>(); //<Article>은 Article밖에 안들어가게 만드는것.
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		articles.add(new Article());
		
		for(int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i); //그래서 형변환 할때 (Article)이 필요없음.
			System.out.println(article.id);
		}
	}
}

class Article{
	static int LastID; //공공재
	int id;
	String regDate;
	
	Article(){
		LastID++;
		this.id = LastID;
	}
	
	Article(int id, String regDate){
		this.id = id;
		this.regDate = regDate;
	}
}
