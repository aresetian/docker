exports.config = {
  seleniumAddress: 'http://192.168.99.100:4444/wd/hub',
   // Capabilities to be passed to the webdriver instance.
  capabilities: {
    'browserName': 'chrome'
  },
  specs: ['todo-spec.js']
};
