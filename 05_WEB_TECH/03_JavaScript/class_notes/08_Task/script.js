let fetchData = async () => {
    let response = await fetch("https://fakestoreapi.com/products");
    let data = await response.json();

    let products = document.getElementById("products");

    data.forEach((product) => {
        products.innerHTML += `
            <div class="card">
                <img src="${product.image}" alt="${product.title}">
                <h3>${product.title}</h3>
                <p>₹${product.price}</p>
                <button>Buy Now</button>
            </div>
       ` ;
    });
};

fetchData();