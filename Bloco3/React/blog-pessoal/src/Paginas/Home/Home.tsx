import React from "react";
import './Home.css';

//Componentes, nada mais são que funções.
function Home() {
    return(
        // <> e </> São chamados de 'fragments', são uma forma abreviada de retornar uma lista de elementos.
        <> 
            <h1 className="titulo" >Home</h1>
            <img src="https://i.imgur.com/4drIr2j.jpg" alt="Imagem teste (Tela Inicial) - Harry Potter" className="img" />
        </>
    )
}

export default Home;