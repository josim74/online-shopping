$(function(){
	//solving the active menu problem
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#productList').addClass('active');
		break;
	default:
		if(menu == "Home") break;
		$('#productList').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
})