// Scroll animation trigger
// eslint-disable-next-line no-undef
document.addEventListener('DOMContentLoaded', () => {
  // eslint-disable-next-line no-undef
  const sections = document.querySelectorAll('.about-zigzag-section');
  const options = {
    threshold: 0.2,
  };

  // eslint-disable-next-line no-undef
  const observer = new IntersectionObserver(function (entries) {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.classList.add('animate');
      }
    });
  }, options);

  sections.forEach(section => {
    observer.observe(section);
  });
});
