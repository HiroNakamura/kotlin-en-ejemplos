package chapter2

/**
 *@author Fer Carraro
 *@date 10/09/2019
 */


import spark.Spark.*

 fun cors(){


    options("/*"){request, response -> 
		response.header("Access-Control-Allow-Headers",request.headers("Access-Control-Request-Headers"));
        response.header("Access-Control-Allow-Methods",request.headers("Access-Control-Request-Method"));  
    }

	before("*"){req, res ->
		res.header("Access-Control-Allow-Origin", "*");
	}

    

 }