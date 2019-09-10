package chapter2

/**
*
*@author Fer Carraro
*@date 07/09/2019
*/

import spark.Spark.*
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
//import com.fasterxml.jackson.core.json.JsonFactory;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.*;

import com.fasterxml.jackson.databind.cfg.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.ObjectMapper


val departamentoDao = DepartamentoDao()
val objectMapper:ObjectMapper  = ObjectMapper();

//http://localhost:4567/holaKotlin
fun getHola(){
   get("/holaKotlin") { req, res -> "Bienvenidos a Kotlin en ejemplos." }
}


fun rest_api(){
   
   path("/api") {
      
      //http://localhost:4567/api/departamentos
      get("/departamentos"){ req, res->
         objectMapper.writeValueAsString(departamentoDao.departamentos)
      }
   
   }
   
}
