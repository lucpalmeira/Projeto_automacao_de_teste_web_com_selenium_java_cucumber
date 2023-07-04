package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarPagina (){
        driver.get("http://lojaebac.ebaconline.art.br/minha-conta/");
        Assert.assertEquals(true,driver.findElement(By.id("customer_login")).isDisplayed());
    }

    public void inserirEmail(){
        driver.findElement(By.id("username")).sendKeys("test@test.com");
    }

    public void inserirSenha(){
        driver.findElement(By.id("password")).sendKeys("123456");
    }

    public void clicarNoBotao (){
        driver.findElement(By.className("button")).click();
    }

    public void acessoSucesso (){
        String acesso_a_conta = driver.findElement(By.className("page-title")).getText();
        System.out.println(acesso_a_conta);
    }

    public void logout (){
        driver.findElement(By.cssSelector("#tbay-topbar > div > div > div > ul > li:nth-child(2) > a")).click();
    }

    public void inserirSenhaErrada (){
        driver.findElement(By.id("password")).sendKeys("1234567");
    }

    public  void mensagemSenhaIncorreta (){
        String senha_incorreta = driver.findElement(By.className("woocommerce-error")).getText();
        System.out.println(senha_incorreta);
    }

    public void inserirEmailErrado (){
        driver.findElement(By.id("username")).sendKeys("test@test.comx");
    }

    public void mensagemEmailIncorreto(){
        String email_incorreto = driver.findElement(By.className("woocommerce-error")).getText();
        System.out.println(email_incorreto);
    }


}
