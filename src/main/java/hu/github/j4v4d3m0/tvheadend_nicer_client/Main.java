package hu.github.j4v4d3m0.tvheadend_nicer_client;

import static def.jquery.Globals.$;

public class Main {
  public static void main(String[] args) {
    def.jquery.Globals.$(".nav-link")
        .click(
            (f) -> {
              $(".nav-item").attr("class", "nav-item");
              f.target.parentElement.setAttribute("class", "nav-item active");
              $("#mainContent").html(f.target.getAttribute("href"));
              return null;
            });
  }
}
