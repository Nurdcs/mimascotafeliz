$(document).ready(function(){
	

	$('.cantidad').on('keyup',function(){
	
	let cat=$('.cantidad').val();
	let pre=$('#pre').val();
	let datos=document.querySelector('#pre');
	let res=cat*pre;
	datos.value = res;
		
		
	});
	
	
	$('.cantidad1').on('keyup',function(){
	
	let cat1=$('.cantidad1').val();
	let pre1=$('#pre1').val();
	let datos1=document.querySelector('#pre1');
	let res1=cat1*pre1;
	datos1.value = res1;
	//alert(cat1+"******"+pre1)
	console.log(datos1)
		
	});
	$('.cantidad2').on('keyup',function(){
	
	let cat2=$('.cantidad2').val();
	let pre2=$('#pre2').val();
	let datos2=document.querySelector('#pre2');
	let res2=cat2*pre2;
	datos2.value = res2;
	
	console.log(datos2)
	
	
		
	});
	
});