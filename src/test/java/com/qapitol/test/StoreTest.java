package com.qapitol.test;

import com.qapitol.main.base.Baseclass;
import com.qapitol.main.base.DataProvider;
import com.qapitol.main.pages.*;
import org.testng.annotations.*;

import java.io.IOException;

public class StoreTest extends Baseclass {
    RegistrationPage registration;
    LoginPage login;
    HomePage homePage;
    Logout out;
    BookDetailsPage books;
    CartPage cart;
    AddressPage add;
    PaymentPage pay;
    ShippingPage ship;
    OrderPage order;
    ProfilePage pro;

    @BeforeMethod
    public void initialization() throws IOException {
       setUp();
        registration = new RegistrationPage(driver);
        login = new LoginPage(driver);
        homePage = new HomePage(driver);
        out= new Logout(driver);
        books = new BookDetailsPage(driver);
        cart= new CartPage(driver);
        add = new AddressPage(driver);
        pay = new PaymentPage(driver);
        ship = new ShippingPage(driver);
        order = new OrderPage(driver);
        pro = new ProfilePage(driver);
    }
    @Test(priority = 0)
    public void RegisterAndPlaceOrder() throws InterruptedException, IOException {
        registration.registerIntoBookstore();
        homePage.selectFirstBook();
        books.firstBook();
        cart.book();
        add.addNewAddress();
        pay.AddCard();
        pay.SelectCard();
        ship.placeOrder();
        order.VerifyPlacedOrder();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 1, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void SigninAndPlaceOrder(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        homePage.selectBookfromBottomRow();
        books.lastBook();
        cart.book();
        add.selectAddress();
        pay.SelectCard();
        ship.placeOrder();
        order.VerifyPlacedOrder();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 2, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void PlaceOrderFromNextPage(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        homePage.selectbookFrom2ndPage();
        books.bookFrom2ndPage();
        cart.book();
        add.selectAddress();
        pay.SelectCard();
        ship.placeOrder();
        order.VerifyPlacedOrder();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 3, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void Placeorderfrom3rdPage(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        homePage.selectBookFrom3rdPage();
        books.bookFrom3rdPage();
        cart.book();
        add.selectAddress();
        pay.SelectCard();
        ship.placeOrder();
        order.VerifyPlacedOrder();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 4, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void PlaceOrderFrom4thpage(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        homePage.selectbookfrom4thpage();
        books.bookFrom4thPage();
        cart.book();
        add.selectAddress();
        pay.SelectCard();
        ship.placeOrder();
        order.VerifyPlacedOrder();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 5, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void deleteAlreadySelectedBookAndAddNewBook(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        homePage.selectFirstBook();
        books.firstBook();
        cart.bookdelete();
        homePage.selectBookfromBottomRow();
        books.lastBook();
        cart.book();
        add.selectAddress();
        pay.SelectCard();
        ship.placeOrder();
        order.VerifyPlacedOrder();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 6, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void SelectSecondCardAndPlaceOrder(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        homePage.selectFirstBook();
        books.bookFrom2ndPage();
        cart.book();
        add.selectAddress();
        pay.select2ncCard();
        ship.placeOrder();
        order.VerifyPlacedOrder();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 7, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void WrongCardNumber(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        homePage.selectFirstBook();
        books.firstBook();
        cart.book();
        add.selectAddress();
        pay.wrongCardNumber();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 8, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void GetRecentOrderDetails(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        homePage.selectFirstBook();
        books.firstBook();
        cart.book();
        add.selectAddress();
        pay.SelectCard();
        ship.placeOrder();
        pro.RecentorderDetail();
        out.logoutFromStore();
        takeScreenshot();
    }
    @Test(priority = 9, dataProvider = "Data",dataProviderClass = DataProvider.class)
    public void UpdateProfile(String uname, String pass) throws InterruptedException, IOException {
        login.LoginToBookstore(uname, pass);
        pro.update();
        takeScreenshot();
    }
    @AfterMethod
    public void TearDown(){
        closeBrowser();
    }
}

