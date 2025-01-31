# Building/publishing

1. `/Users/mcmichael/.gem/ruby/2.6.0/bin/asciidoctor-multipage index.adoc`
 (or `/usr/local/bin/asciidoctor-multipage index.adoc`)
 (or `~/.gem/ruby/2.6.0/bin/asciidoctor-multipage index.adoc`)
2. Commit to main branch
3. In GitHub web ui: create pull request to merge. gh-pages as base, to merge with main

 <!-- -o index.html -D /Users/mcmichael/Documents/timmcmichael.github.io/ -->
<!--
`-D` argument specifies output directory, which could just be a subfolder in gh-pages project -->


 `sudo gem install pygments.rb`
 ~/.gem/ruby/2.6.0/bin/asciidoctor-multipage -r ~/.gem/ruby/2.6.0/gems/asciidoctor-diagram-2.3.1/lib/asciidoctor-diagram index.adoc

 /Library/Ruby/Gems/2.6.0

 /usr/local/bin/asciidoctor-multipage -r /Library/Ruby/Gems/2.6.0/gems/asciidoctor-diagram-2.3.1/asciidoctor-diagram index.adoc


Desktop:
/usr/local/bin/asciidoctor-multipage -r /Library/Ruby/Gems/2.6.0/gems/asciidoctor-diagram-2.3.1/lib/asciidoctor-diagram index.adoc