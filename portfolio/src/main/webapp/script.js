function sayTheirName() {
  const names =
      ['George Floyd', 'Ahmaud Arbury', 'Breonna Taylor', 'Tyrique Hudson'];

  // Pick a random greeting.
  const name = names[Math.floor(Math.random() * names.length)];

  // Add it to the page.
  const namesContainer = document.getElementById('names-container');
  namesContainer.innerText = name;
} 
function getComments(){
    fetch('/data').then((comments) => {
        // const listComments = document.getElementById('comments-container'); 
        // listComments.innerHTML = '';
        // listComments.appendChild(
        //     createListElement('David: ' + comments));
        console.log(comments);
    });
} 
function createListElement(text) { 
    const liElement = document.createElement('li');
    liElement.innerText = text;
    return liElement;
}
