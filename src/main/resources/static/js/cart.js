// eslint-disable-next-line no-unused-vars
function openCartWidget() {
  // eslint-disable-next-line no-undef
  document.getElementById('cart-widget').classList.add('show');
  // eslint-disable-next-line no-undef
  document.getElementById('cart-widget-overlay').classList.add('show');
}

// eslint-disable-next-line no-unused-vars
function closeCartWidget() {
  // eslint-disable-next-line no-undef
  document.getElementById('cart-widget').classList.remove('show');
  // eslint-disable-next-line no-undef
  document.getElementById('cart-widget-overlay').classList.remove('show');
}
