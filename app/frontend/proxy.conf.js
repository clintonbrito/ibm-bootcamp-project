const PROXY_CONFIG = [
  {
    context: ['/api'],
    target: 'http://backend:8080/',
    secure: false, // HTTPS
    logLevel: 'debug'
  }
];

module.exports = PROXY_CONFIG;
