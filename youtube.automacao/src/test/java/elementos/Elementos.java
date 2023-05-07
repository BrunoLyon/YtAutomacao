package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By pesquisar = By.name("search_query");
	public By lupa = By.id("search-icon-legacy");
	public By playListC = By.xpath("//*[@id=\"view-more\"]/a");
	public By btnPlayer = By.xpath("//*[@id=\"page-manager\"]/ytd-browse[2]/ytd-playlist-header-renderer/div/div[2]/div[1]/div/div[2]/ytd-button-renderer[1]/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]");
	public By espandirTela = By.xpath("//*[@id=\"movie_player\"]/div[26]/div[2]/div[2]/button[9]");
	public By pularAnuncio = By.xpath("//*[@id=\"skip-button:5\"]/span/button");
	public By reCaptcha = By.xpath("//*[@id=\"dismiss-button\"]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]");
}
