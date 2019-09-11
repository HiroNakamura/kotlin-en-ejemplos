/*cliente REST*/

var cliente={
   init: function(){
     console.log('Cliente REST');
     
     fetch('http://localhost:4567/api/departamentos')
     .then(response => response.json())
        .then(departamentos =>{
            for(var departamento in departamentos){
                console.log('Departamento: ',departamentos[departamento].nombre);
            }
        })
        .catch(e=>{
            console.error("Error en el servidor:"+e);
        })
     
   }
};

window.addEventListener("load",cliente.init);
