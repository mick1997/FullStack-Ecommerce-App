export default {
  oidc: {
    // Public identifier of the user
    clientId: '0oaa5x5n5n58aqD255d7',
    // Issuer of tokens, URL when authorizing with Okta Authorization Server
    issuer: 'https://dev-32691310.okta.com/oauth2/default',
    // Once user logs in where to send user
    redirectUri: 'https://localhost:4200/login/callback',
    // Scopes provide access to information about a user
    // openid: required for authentication requests
    // profile: user's first name, last name, phone etc
    // email: user's email address
    scopes: ['openid', 'profile', 'email'],
  },
};
