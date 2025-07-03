/* eslint-env browser */

/** @type {Document} */
// eslint-disable-next-line no-undef
const doc = document;

doc.addEventListener('DOMContentLoaded', () => {
  const images = doc.querySelectorAll('.grid-item img');

  images.forEach(img => {
    if (img.complete) {
      img.classList.add('loaded');
    } else {
      img.addEventListener('load', () => img.classList.add('loaded'));
    }
  });
});
