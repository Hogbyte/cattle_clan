# The Cattle Clan

A preserved static website for **The Cattle Clan**, a Minnesota paintball team active in the early 2000s. The site was originally hosted on [GeoCities](https://en.wikipedia.org/wiki/Yahoo!_GeoCities) and has been restored for local viewing and archival purposes.

## About

The Cattle Clan played at and documented several southwest Minnesota paintball locations, including Christensen Grove, the Wabasso and Seaforth gravel pits, and Marshall. The site covers team members, equipment, field layouts, construction projects, event photo galleries, and a handful of bonus games and links from the era.

Team members:

| Name   | Alias    |
|--------|----------|
| David  | Longhorn |
| Daniel | Angus    |
| Brian  | Jersey   |

## Site structure

| Path | Description |
|------|-------------|
| [`index.html`](index.html) | Main page with updates, polls, and navigation |
| [`members/`](members/) | Team member profiles and bios |
| [`markers/`](markers/) | Paintball marker (gun) write-ups |
| [`field/`](field/) | Field rules, directions, and location galleries |
| [`projects/`](projects/) | Finished, in-progress, and planned field projects |
| [`events/`](events/) | Event photo galleries (2004 games and tournaments) |
| [`bonus/`](bonus/) | Games, humor, caption contest, and paintball links |
| [`motley/`](motley/) | Miscellaneous pages |
| [`java/`](java/) | Legacy Java login experiments |
| [`tank_updates.html`](tank_updates.html) | Paintball tank build progress photos |

The **Field** section includes the current Grove layout plus seasonal photo archives (`fall03`, `spring04`, `summer03`, `summer04`, `winter04`, `sb04`) and general field services (marker rentals, CO₂ fills, equipment help).

## Viewing locally

This is a plain HTML/CSS site with no build step. Open any page in a browser, or serve the directory with a simple static file server:

```bash
# Python 3
python -m http.server 8000

# Then visit http://localhost:8000
```

Start at [`index.html`](index.html).

## Restoration notes

Recent maintenance in this repository includes:

- Renaming legacy `.htm` files to `.html` where appropriate
- Removing GeoCities-specific tags and widgets
- Fixing internal links between pages
- Disabling forms and external links that no longer work (guestbook, mailing list, Yahoo forms, Network54 forum)

Original GeoCities-hosted features such as the guestbook and web forms are left in place visually but marked unavailable so the pages still read as they did historically.

## Tech stack

- HTML 4.0 Transitional
- Inline and linked CSS (`pageStyle.css`, `defaultStyle.css`, section-specific stylesheets)
- Legacy Java applets in `java/` (may not run in modern browsers)
- No package manager, bundler, or backend required

## Repository

[https://github.com/Hogbyte/cattle_clan](https://github.com/Hogbyte/cattle_clan)

## Deployment

Deployed via GitHub Pages/Actions to [https://hogbyte.github.io/cattle_clan](https://hogbyte.github.io/cattle_clan)