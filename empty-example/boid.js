class Boid{
  constructor() {
    this.position = createVector(random(width), random(height));
    this.velocity = p5.Vector.random2D();
    this.velocity.setMag(random(2,4));
    this.acceleration = createVector();
    this.maxForce = 1;
    this.maxSpeed = 4;
    this.flockID = random(0,100);
    this.flockSize = 0;
    this.color = 255;
  }
  edges(){
    //Collision based model
    // if (this.position.x > width||this.position.x < 0){
    //   this.velocity.x = -this.velocity.x*1.000001+0.01;
    // }
    // if (this.position.y > height||this.position.y < 0){
    //   this.velocity.y = -this.velocity.y*1.000001+0.01;
    // }


    //Wrap based model
    if (this.position.x > width){
      this.position.x = 0;
    } else if (this.position.x < 0){
      this.position.x = width;
    }
    if (this.position.y > height){
      this.position.y = 0;
    } else if (this.position.y < 0){
      this.position.y = height;
    }
  }

  align(boids){
    let perception = 50;
    let avg = createVector();

    let i = 0;
    for (let others of boids){
      let dist = sqrt(sq(this.position.x-others.position.x)+sq(this.position.y-others.position.y))
      if (others != this && dist <= perception) {
          others.flockID = this.flockID;
          avg.add(others.velocity)
          i++;
          this.flockSize = i;
      }
    }
    if (i>0){
      avg.div(i);
      avg.setMag(this.maxSpeed);
      avg = avg.sub(this.velocity);
      avg.limit(this.maxForce);
    }
    return avg;
  }

  separation(boids){
    let perception = 50;
    let avg = createVector();

    let i = 0;
    for (let others of boids){
      let dist = sqrt(sq(this.position.x-others.position.x)+sq(this.position.y-others.position.y))
      if (others != this && dist <= perception) {
          let diff = p5.Vector.sub(this.positon, others.position);
          diff.div(dist);
          others.flockID = this.flockID;
          avg.add(diff)
          i++;
          this.flockSize = i;
      }
    }
    if (i>0){
      avg.div(i);
      avg.setMag(this.maxSpeed);
      avg = avg.sub(this.velocity);
      avg.limit(this.maxForce);
    }
    return avg;
  }


  cohesion(boids){
    let perception = 50;
    let avg = createVector();

    let i = 0;
    for (let others of boids){
      let dist = sqrt(sq(this.position.x-others.position.x)+sq(this.position.y-others.position.y))
      if (others != this && dist <= perception) {
          this.flockID = others.flockID;
          avg.add(others.position)
          i++;
          this.flockSize = i;
      }
    }
    if (i>0){
      avg.div(i);
      avg.sub(this.position);
      avg.setMag(this.maxSpeed);
      avg = avg.sub(this.velocity);
      avg.limit(this.maxForce);
    }
    return avg;
  }

  flock(boids){
    this.acceleration.set(0,0);
    let alignment = this.align(boids);
    let cohesion = this.cohesion(boids);
    let separation = this.separation(boids);
    // this.acceleration.add(alignment);
    // this.acceleration.add(cohesion);
    this.acceleration.add(separation);
  }
  update(){
    this.velocity.limit(this.maxSpeed);
    this.position.add(this.velocity);
    this.velocity.add(this.acceleration);
  }

  show(){
    if (this.flockID == 7.0){
      this.color = 255;
    }
    strokeWeight(10);
    stroke(this.color);
    point(this.position.x, this.position.y);
  }
}
