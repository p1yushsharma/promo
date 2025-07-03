// eslint-disable-next-line no-unused-vars
function openLoginWidget() {
  // eslint-disable-next-line no-undef
  document.getElementById('login-widget-overlay').style.display = 'block';
  // eslint-disable-next-line no-undef
  document.getElementById('login-widget').classList.add('visible');
}

// eslint-disable-next-line no-unused-vars
function closeLoginWidget() {
  // eslint-disable-next-line no-undef
  document.getElementById('login-widget-overlay').style.display = 'none';
  // eslint-disable-next-line no-undef
  document.getElementById('login-widget').classList.remove('visible');
}

// eslint-disable-next-line no-unused-vars
function switchTab(tab) {
  // eslint-disable-next-line no-undef
  document.getElementById('login-tab').classList.remove('active');
  // eslint-disable-next-line no-undef
  document.getElementById('signup-tab').classList.remove('active');
  // eslint-disable-next-line no-undef
  document.getElementById('login-form').classList.remove('visible');
  // eslint-disable-next-line no-undef
  document.getElementById('signup-form').classList.remove('visible');

  if (tab === 'login') {
    // eslint-disable-next-line no-undef
    document.getElementById('login-tab').classList.add('active');
    // eslint-disable-next-line no-undef
    document.getElementById('login-form').classList.add('visible');
  } else {
    // eslint-disable-next-line no-undef
    document.getElementById('signup-tab').classList.add('active');
    // eslint-disable-next-line no-undef
    document.getElementById('signup-form').classList.add('visible');
  }
}
