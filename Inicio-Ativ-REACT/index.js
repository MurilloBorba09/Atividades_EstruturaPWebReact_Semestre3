var container = document.getElementById("root");

// var titulo = document.createElement("h1");
// titulo.innerHTML = "Título inserido pelo JavaScript!";
// container.appendChild(titulo);

// function Titulo(props) {
//     return (
//         <React.Fragment> 
//             <h1>{props.texto}</h1>
//         </React.Fragment>
//     );
// }

// function Titulos() {
//     return (
//         <>
//             <Titulo texto = "Puta" />      
//             <Titulo texto = "que" /> 
//             <Titulo texto = "Pariu" /> 
//         </>
//     );
// }

// VERSÃO ANTIGA:
// ReactDOM.render(<Titulo />, container)

function Participante(props) {

    const [numero, setNum] = React.useState(0);

    function votar() {
        setNum(numero + 1);
    };

    return (
        <>
            <h1>{props.nome}</h1>
            <h2>{numero}</h2>
            <button onClick={votar}>votar</button>
        </>
    );
}

function Votacao() {

    return (
        <>
            <Participante nome="Méqui" />
            <Participante nome="Bks" />
            <Participante nome="Papais" />
        </>
    )
}

ReactDOM.createRoot(container).render(<Votacao />);