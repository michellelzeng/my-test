var expect = require ('expect.js');

function it(desc, fn) {
	try{
		fn();
	} catch (e) {
		console.log('assertion fails!', e.name + ':' + e.message);
		console.log(e.stack);
	}
}

console.log('start running test');


it('3 should equal 4', function () {
	expect(3).to.equal(4);	
})

// run multiple it functions




