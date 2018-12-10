class BoidKing extends Boid {
  constructor(key) {
    super();
    const flockID = key;
    const color = 12;
  }
  show(){
    this.flockID = 7.0
    strokeWeight(10);
    stroke(255);
    point(this.position.x, this.position.y);
  }
}
