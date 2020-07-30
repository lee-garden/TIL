import React from 'react';
import PropTyeps from 'prop-types';


class App extends React.Component{
  state = {
    count: 0
  };

  add = () => {this.setState(current => ({ count: current.count + 1 }))};
  minus = () => {this.setState(current => ({ count: current.count - 1}))};

  componentDidMount() {
    console.log("component rendered")
  }
  componentDidUpdate() {
    console.log("updated")
  }
  componentWillUnmount() {
    console.log("component unmounted")
  }
  render() {
    console.log("render");
    return (
      <div>
        <h1>The number is {this.state.count}</h1>
        <button onClick={this.add}>Add</button>
        <button onClick={this.minus}>Minus</button>
      </div>
    )
  }
}

export default App;
