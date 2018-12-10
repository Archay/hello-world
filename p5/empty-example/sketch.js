const flock = [];
function setup() {
  createCanvas(1280, 720);
  for (i =0; i<100; i++)
  {
    flock.push(new Boid());
  }
  //flock.push(new BoidKing(7.0));
}

function draw() {
  background(51);
  for(let boid of flock) {
    boid.update();
    boid.show();
    boid.edges();
    boid.flock(flock);
  }
}
