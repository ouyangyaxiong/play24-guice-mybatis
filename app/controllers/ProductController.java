package controllers;

import java.util.List;

import com.google.inject.Inject;

import model.Product;
import play.mvc.Controller;
import play.mvc.Result;
import service.ProductMapper;
import views.html.*;
public class ProductController extends Controller{
	@Inject
	ProductMapper pmapper;
	public Result show(){
		List<Product> plist=pmapper.getProducts();
		return ok(views.html.product.productlist.render(plist));
	}
}
