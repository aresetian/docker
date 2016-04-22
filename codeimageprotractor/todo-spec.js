describe('angularjs homepage todo list', function() {
  it('should add a todo', function() {
    browser.get('http://192.168.99.100:8888/angularjstest/');

    element(by.model('yourName')).sendKeys('write first protractor test');


    var greeting = element(by.binding('yourName'));
    expect(greeting.getText()).toEqual('Hello write first protractor test!');
  });
});